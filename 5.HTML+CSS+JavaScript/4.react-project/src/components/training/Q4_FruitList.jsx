
function FruitList() {
    const fruits = ["사과", "바나나", "포도"];
    return (
        <ul>
            {fruits.map((fruit, index) => (
                <li key={index}>{fruit}</li>
            ))}
        </ul>
    );
}

export default FruitList;