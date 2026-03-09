import { useState } from "react";

function MultipleState() {
    const [name, setName] = useState('김재섭');
    const [age, setAge] = useState(19);
    const [isClick, setIsClick] = useState(false);

    function updateName() {
        setName('홍길동')
    }
    return(
        <>
            <p>이름: {name}</p>
            <p>나이: {age}</p>
            {/* 일반함수 */}
            <button onClick={updateName}>이름 변경</button>
            {/* 화살표 함수 */}
            <button onClick={() => setAge(19)}>나이 변경</button>
            <button onClick={() => setIsClick(!isClick)}></button>
                {isClick ? '메시지 숨기기' : '메시지 보기'}
        </>

    )
}

export default MultipleState;