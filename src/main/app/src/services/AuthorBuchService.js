import axios from "axios"

const AUTHOR_API_URL = "http://localhost:8080/author";
const BUCHER_API_URL = "http://localhost:8080/bucher";

class AuthorBuchService
{
    getAuthoren()
    {
        return axios.get(AUTHOR_API_URL);
    }

    getBucher()
    {
        return axios.get(BUCHER_API_URL);
    }
}

export default new AuthorBuchService();