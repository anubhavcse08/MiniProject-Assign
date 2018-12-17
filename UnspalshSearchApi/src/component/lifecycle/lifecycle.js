import React from 'react'

class LifeCycle extends React.Component {
    constructor(props) {
        super(props);
        this.state = {number: this.props.filteredStudent};
      }
      componentWillReceiveProps(nextProps) {
        if (this.props.number !== nextProps.number) {
          this.setState({number: nextProps.number});
        }
      }

    componentWillMount() {
        console.log("Before: componentWillMount")
    }
    componentWillUpdate() {
        console.log("componentWillUpdate")
    }
	componentWillUnmount() {
        console.log("Before: componentWillUnmount")
    }
    componentDidUnmount() {
        console.log("componentDidUnmount")
    }
    render() {
        console.log("Rendering()")
        console.log('componentWillReceiveProps',this.state.number)
        return (
            <div>
                <h1>{this.state.number}</h1>
            </div>
        )
    }
    componentDidMount() {
        console.log("After: componentDidMount")
    }
    componentDidUpdate() {
        console.log("componentDidUpdate")
    }
}

export default LifeCycle