import React from 'react';

class CommentBox extends React.Component {
    state = { comment:''}

    handleChange = (e) => {
        this.setState({ comment:e.target.value })
    }
    handleSubmit = (e) => {
        e.preventDefault();
        this.setState({ comment:''})
    }
    render() {
        // console.log(this.state.comment)
        return(
            <div>
                <form onSubmit={this.handleSubmit}>
                    <h4>Add Comment</h4>
                    <textarea onChange={this.handleChange} value={this.state.comment}/>
                    <div>
                        <button>Sunbmit Comment</button>
                    </div>
                </form>
            </div>
        );
    }
}

export default CommentBox;