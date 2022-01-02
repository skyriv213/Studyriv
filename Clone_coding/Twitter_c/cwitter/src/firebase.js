// import 문으로 모듈을 불러오기
// firebase/app의 모든 모듈을 firebase라는 객체에 부여한다는 뜻
import firebase from "firebase/app";

// 
const firebaseConfig = {
  
  // 다른 파일에서 환경변수를 가져다 쓰는 경우에는 단순히 변수의 이름만 입력하는 것이 아닌
  // process.env. 같이 앞에 파일의 이름과  process를 기입해야한다
  // .env 파일을 읽어 파일 안에 있는 변수값을 불러오라는 의미
  
  // process.env.REACT_APP_API_KEY의 경우는 클론 코딩을 한 파일을 빌드하는 시점에 .env의 파일의 
  // apikey값을 비밀키로 대체를 하는것이다. 
  // 이러한 방식으로 코드에 비밀 키를 노출하지 않으면서 실제로는 비밀키를 입력 할 수 있다.
  
  
  apikey : process.env.REACT_APP_API_KEY,
  authDomain : process.env.REACT_APP_API_AUTH_DOMAIN,
  projectId : process.env.REACT_APP_PROGECT_ID,
  storageBucket :process.env.REACT_APP_STORAGE_BUCKET,
  messagingSender:process.env.REACT_APP_MESSAGING_SENDER_ID,
  appId : process.env.REACT_APP_APP_ID
  };

  // initializeApp함수를 firebase 객체에서 꺼내 사용한것
  const app = initializeApp(firebaseConfig);

