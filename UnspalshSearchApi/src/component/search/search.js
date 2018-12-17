import React from 'react'


class Search extends React.Component {

    state = {
        search:''
    }
    onChangeImageState=(e) => {
        this.setState({
            search: e.target.value
        })
        this.props.searchImageMethod(e.target.value);
    }

    // onChangeVideoState=(e) => {
    //     this.setState({
    //         search: e.target.value
    //     })
    //     this.props.searchVideoMethod(e.target.value);
    // }
    render() {
        let style = {
            margin: '15px',
            padding:'15px',
            border: '2px solid #d3d3d3',
        }
        let labelStyle = {
            fontSize: '25px'
        }
        return(
            <div>
                <label style={labelStyle}> Google Search: </label>
                <input 
                       style={style}
                       type="text"
                       placeholder="Enter the text"
                       onChange={this.onChangeImageState}/>

                {/* <label style={labelStyle}>Youtube Search: </label>
                <input 
                       style={style}
                       type="text"
                       placeholder="Enter the text"
                       onChange={this.onChangeVideoState}/> */}
            </div>
        )
    }
}

export default Search