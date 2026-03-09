
function EventList() {
    const numbers = [1, 2, 3, 4, 5, 6];
    
    const eventNumbers = numbers.filter((num) => num %2 === 0);
    return(
        <div>
            {eventNumbers.map((num, index) => (
                <p key={index}>{num}</p>
            ))}
        </div>
    );
}

export default EventList;