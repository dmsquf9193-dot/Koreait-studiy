import LoginStatus from "../../components/training/Q3_LoginStatus";

function LoginPage () {
    const isLogin = true;
    return (
        <div>
            <LoginStatus isLogin={isLogin} />
        </div>
    );
}

export default LoginPage;