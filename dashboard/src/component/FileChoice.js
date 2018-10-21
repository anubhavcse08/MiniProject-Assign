import React from 'react';
import './FileChoice.css';
import TaskTable from './Grid/TaskTable'

class FileChoice extends React.Component {

    constructor() {
        super();
        this.fileReader = new FileReader();
        this.state = {
            dispalyContent: [],
            arr:[],
            sendingArr: []
        }
       
    }
    
    handleFileChoosen(file) {
        this.fileReader.onloadend = () => {
            this.dispalyContent = this.fileReader.result.split('\n')
            this.setState({dispalyContent : this.dispalyContent})
        };
        this.fileReader.readAsText(file);
    };
    render() {

        return 	<div className='upload-expense'>
                    <div className="companyName">
                         <h1>Employee Dashboard</h1>
                    </div>
                    <input type="file"
                        id="file"
                        className="input-file1"
                        accept=".csv"
                        onChange={e => this.handleFileChoosen(e.target.files[0])}
                    />
                        
                    <TaskTable gridData={this.state.dispalyContent}/>
                </div>
    }
    
}

export default FileChoice