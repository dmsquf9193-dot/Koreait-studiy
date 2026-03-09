
function Menu(props) {
    return(
        <ul>
            {props.menus.map((menu, index) => (
                <li key={index}>{menu}</li>
            ))}
        </ul>
    );
}

export default Menu;