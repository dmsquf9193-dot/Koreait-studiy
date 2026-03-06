
export default function Extension() {
    const todoHeader = "todo-header"

    return (
        <>
            <h1 className={todoHeader}>Todo List</h1>

            <ul style={{backgroundColor: "yellow", color: "green"}}>
                <li>잠자기</li>
                <li>먹기</li>
                <li>놀기</li>
            </ul>
        </>
    )
}