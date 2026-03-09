
function LoginStatus(props){
    return (
        <div>
            {props.isLogin ?
            <h3>로그인 성공</h3>
            :
            <h3>로그인 필요</h3>
            }
        </div>
    );
}

export default LoginStatus;