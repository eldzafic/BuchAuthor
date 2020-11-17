import React from "react";
import AuthorBuchService from "../services/AuthorBuchService";

class AuthorBuchComponent extends React.Component {
    constructor(props) {
        super();
        this.state = {
            authoren: [],
            bucher: []
        };
    }

    componentDidMount() {
        AuthorBuchService.getBucher().then((response) => {
            this.setState({bucher: response.data})
        })

        AuthorBuchService.getAuthoren().then((response) => {
            this.setState({authoren: response.data})
        })
    }


    render() {
        return (
            <div className={"container"}>
                <h1 className="text-center font-weight-bold">Authoren</h1>
                <table className="table table-striped">
                    <thead className="thead-dark">
                    <tr>
                        <th>
                            Author ID
                        </th>
                        <th>
                            Author Name
                        </th>
                    </tr>
                    </thead>
                    <tbody>


                    {
                        this.state.authoren.map(
                            author =>
                                <tr key={author.id}>
                                    <td>{author.id}</td>
                                    <td>{author.name}</td>
                                </tr>

                        )
                    }
                    </tbody>
                </table>


                <h1 className="text-center font-weight-bold">Bücher</h1>
                <table className="table table-striped">
                    <thead className="thead-dark">
                    <tr>
                        <th>
                            Buch ID
                        </th>
                        <th>
                            Titel
                        </th>
                        <th>
                            Author ID
                        </th>
                    </tr>
                    </thead>
                    <tbody>


                    {
                        this.state.bucher.map(
                            buch =>
                                <tr key={buch.id}>
                                    <td>{buch.id}</td>
                                    <td>{buch.titel}</td>
                                    <td>{buch.author_id}</td>
                                </tr>
                        )
                    }
                    </tbody>
                </table>
            </div>
        )
    }













}

export default AuthorBuchComponent;