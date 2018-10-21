import React from 'react'

export default class Grid extends React.Component {
    constructor() {
        super();
            this.state= {
            id:'',
            filtering: '',
            filteringByID: '',
            filteringByScheduleState: '',
            filteringByOwner: '',
            gridData: []
        }
    }

    componentWillReceiveProps(nextProps) {
        if(nextProps.gridData !== this.props.gridData) {
            this.setState({
                gridData: this.arrMethod(nextProps)
            })
        }
    }

    onChangeHandler(e) {
        const filterStr = e.target.value
        const gridData = this.arrMethod(this.props).filter((el) => (el[0]+el[1]+el[2]+el[7]).toLowerCase().indexOf(filterStr.toLowerCase()) > -1);
        console.log(gridData)
        this.setState({
            filtering: filterStr,
            gridData
        })
    }
    onChangeHandlerByID(e) {
        const filterStr = e.target.value
        const gridData = this.arrMethod(this.props).filter((el) => (el[0]).toLowerCase().indexOf(filterStr.toLowerCase()) > -1);
        this.setState({
            filteringByID: filterStr,
            gridData
        })
    }
    onChangeHandlerByState(e) {
        const filterStr = e.target.value
        const gridData = this.arrMethod(this.props).filter((el, index) => {
            // console.log('test', el[2], filterStr, index)
            return  el[2] && (el[2]).toLowerCase().indexOf(filterStr.toLowerCase()) > -1;
        })
        console.log(gridData, filterStr)
        this.setState({
            filteringByScheduleState: filterStr,
            gridData
        })
    }
    onChangeHandlerByOwner(e) {
        const filterStr = e.target.value
        const gridData = this.arrMethod(this.props).filter((el) => {
            return el[7] && el[7].toLowerCase().indexOf(filterStr.toLowerCase()) > -1;
        })
        this.setState({
            filteringByOwner: filterStr,
            gridData
        })
    }

    OnAddInProgress() {
        let s=0;
        
        const sum = this.arrMethod(this.props).map(x => {
            if(isNaN(parseFloat(x[3]))) {
                x[3] = 0;
            }
            else if(x[2]==='In-Progress')
                s= parseFloat(x[3]) +s;
            return s;
        }) 
        return sum[sum.length-1]
    }
    OnAddDefined() {
        let s=0;
        
        const sum = this.arrMethod(this.props).map(x => {
            if(isNaN(parseFloat(x[3]))) {
                x[3] = 0;
            }
            else if(x[2]==='Defined')
                s= parseFloat(x[3]) +s;
            return s;
        }) 
        return sum[sum.length-1]
    }
    OnAddAccepted() {
        let s=0;
        
        const sum = this.arrMethod(this.props).map(x => {
            if(isNaN(parseFloat(x[3]))) {
                x[3] = 0;
            }
            else if(x[2]==='Accepted')
                s= parseFloat(x[3]) +s;
            return s;
        }) 
        return sum[sum.length-1]
    }
    OnAddComleted() {
        let s=0;
        
        const sum = this.arrMethod(this.props).map(x => {
            if(isNaN(parseFloat(x[3]))) {
                x[3] = 0;
            }
            else if(x[2]==='Completed')
                s= parseFloat(x[3]) +s;
            return s;
        }) 
        return sum[sum.length-1]
    }
    
    
    
    renderHeader(){
        return(
            <thead>
                <tr>
                    <th>Formatted ID</th>
                    <th>Name</th>
                    <th>Schedule State</th>
                    <th>Plan Estimate</th>
                    <th>Task Estimate Total</th>
                    <th>Task Actual Total</th>
                    <th>Task Remaining Total</th>
                    <th>Owner</th>
                </tr>
                                        
            </thead>
        )
    }
    renderRow(rowData, index){
        
        return(  
            <tr key={index}>
                
                <td>{rowData[0]}</td>
                <td>{rowData[1]}</td>
                <td>{rowData[2]}</td>
                <td>{rowData[3]}</td>
                <td>{rowData[4]}</td>
                <td>{rowData[5]}</td>
                <td>{rowData[6]}</td>
                <td>{rowData[7]}</td>
            </tr>
        )
    }
    rednerData(){
        const { gridData } = this.state;
        const gridStr = gridData.map((rowData, index) => {
            return this.renderRow(rowData, index)
        })
        return(
            <tbody>
                {gridStr}
            </tbody>
        )
    }
    arrMethod(props) {
        const {gridData} = props;
        
        const arr = []
        gridData.forEach((x, i) => {
            const firstIndex = x.split(',')
            if(i) {
                arr.push(firstIndex)
            }
        });
        return arr;
    }
    
    render(){
        const header = this.renderHeader();
        const grid = this.rednerData()
		
        return(
            <div>
                <div>
                    <input type="text"
                            id={this.id}
                            value={this.state.filtering}
                            className="input-file2"
                            placeholder="Search..."
                            onChange={this.onChangeHandler.bind(this)}
                    />
                    <input type="text"
                            id={this.id}
                            list="filterByID"
                            value={this.state.filteringByID}
                            className="input-file2"
                            placeholder="Search by ID..."
                            onChange={this.onChangeHandlerByID.bind(this)}
                    />
                    <input type="text"
                            id={this.id}
                            value={this.state.filteringByScheduleState}
                            className="input-file2"
                            placeholder="Search by schedule state..."
                            onChange={this.onChangeHandlerByState.bind(this)}
                    />
                    <input type="text"
                            id={this.id}
                            value={this.state.filteringByOwner}
                            className="input-file2"
                            placeholder="Search by owner..."
                            onChange={this.onChangeHandlerByOwner.bind(this)}
                    />
                    </div>
                    <div className="hrLine">
                        <hr></hr>
                    </div>
                    <div className="totalDetals">
                        <h2>Total PlanEstimate according to schedulestates :</h2>
                        <table id="details">
                            <tr>
                                <th>InProgress</th>
                                <th>Defined</th>
                                <th>Accepted</th>
                                <th>Completed</th>
                                <th>Total</th>
                            </tr>
                            <tr>
                                <td>{this.OnAddInProgress()}</td>
                                <td>{this.OnAddDefined()}</td>
                                <td>{this.OnAddAccepted()}</td>
                                <td>{this.OnAddComleted()}</td>
                                <td>{this.OnAddInProgress()+this.OnAddDefined()+this.OnAddAccepted()+this.OnAddComleted()}</td>
                            </tr>
                        </table>
                    </div>
                    <hr></hr>
                    <table id="customers">
                        {header}
                        {grid}
                    </table>        
            </div>
            
        )
    }
}