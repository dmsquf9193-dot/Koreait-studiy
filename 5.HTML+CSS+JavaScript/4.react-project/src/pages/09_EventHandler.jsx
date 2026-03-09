
function EventHandler() {
    function handleClick() {
        alert('클릭되었습니다.');
    } // JavaScript 코드 작성하는 공간

    return (
        <button onClick={handleClick}>클릭</button>
    )
}

export default EventHandler;