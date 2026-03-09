import Menu from "../../components/training/Q6_Menu";

function MenuPage() {
    const menus = ["홈", "소개", "문의하기"];

    return(
        <div>
            <Menu menus={menus}/>
        </div>
    );
}

export default MenuPage;