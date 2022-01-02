import { useState } from "react";
import { HashRouter as Router, Route,Switch } from "react-router-dom";
// as를 사용해서 HashRouter를 Router로 변경 -> 코드의 가독성 증가
import Auth from "../routes/Auth";
import Home from "../routes/Home";

const AppRouter =()=> {
    const [isLoggedIn, setIsLoggedIn] = useState(true);
    // 상태, 상태 관리 함수 이름으로 구성
    return (
        <Router>
            <Switch>
                {isLoggedIn ?(
                    <Route exact path="/">
                        <Home />
                    </Route>
                ) : (
                    <Route exact path = "/">
                        <Auth />
                    </Route>
                )}
            </Switch>
        </Router>
    );
};

export default AppRouter