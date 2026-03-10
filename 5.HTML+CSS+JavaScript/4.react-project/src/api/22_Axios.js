import axiocInstance from "../config/AxiosConfig";

export const getUser = async () => {
    try {
        // const response = await axiocInstance.get("https://jsonplaceholder.typicode.com/users");
        const response = await axiocInstance.get("http://localhost/api");
        return response.data;
    } catch (err) {
        console.error("통신 실패 : ", err);
    }
}