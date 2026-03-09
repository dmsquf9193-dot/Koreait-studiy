
function Button() {
    function HandleClick() {
        alert("버튼이 클릭되었습니다.");
    }

    return (
        <button onClick={HandleClick}>클릭하기</button>
    );
}

export default Button;