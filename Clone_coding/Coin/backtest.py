import pyupbit
import numpy as np

# OHLCV = (open high, low, close, volume)로 당일 시가, 고가, 저가, 종가. 거래량에 대한 데이터를 의미
df = pyupbit.get_ohlcv("KRW-MBL", count = 7)

# 변동성 돌파 기준 범위 계산, (고가-저가)*k값
df['range'] = (df['high'] - df['low']) * 0.1

# target(매수가), range 컬럼을 한칸씩 밑으로 내림(.shift(1))
df['target'] = df['open'] + df['range'].shift(1)

print(df)


fee = 0.0005

#ror(수익률), np.where(조건문, 참일때 값, 거짓일때 값)
df['ror'] = np.where(df['high'] > df['target'],
                     df['close'] / df['target'] - fee,
                     1)

#누적 곱 계산(comprod) => 누적 수익률
df['hpr'] = df['ror'].cumprod()

#Draw Down 계산 (누적 최대값과 현재 hpr의 차이 / 누적 최대값*100
df['dd'] = (df['hpr'].cummax() - df['hpr']) / df['hpr'].cummax() * 100

#MDD (Max Draw Down) 값 계산
print("MDD(%): ", df['dd'].max())

#엑셀로 출력
df.to_excel("dd.xlsx")