import { Link } from "react-router-dom";

function Header(){
    return (
        <header style={{padding:"20px", borderBottom:"1px solid #ddd"}}>
            <nav>
                <Link to="/" style={{marginRight:"20px"}}>
                    Home
                </Link>

                <Link to="/users">
                    Users
                </Link>
            </nav>
        </header>
    )
}

export default Header;