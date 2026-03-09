import{useState} from "react";

function Message() {
    const [message, setMessage] = useState("안녕하세요.");

    function changeMessage() {
        setMessage("반갑습니다.");
    }

    return(
        <div>
            <h3>{message}</h3>
            <button onClick={changeMessage}>변경하기</button>
        </div>
    );
}

export default Message;