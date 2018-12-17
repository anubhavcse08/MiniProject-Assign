import React from 'react';

class ImageRender extends React.Component {
    render() {
        const images = this.props.images;
        let style ={
            width:'300px',
            height:'300px',
            float:'left',
            padding: '10px',
            border: '2px solid #d3d3d3',
            marginLeft: '25px',
            marginTop: '20px',
            marginRight: '10px'
        }
        return(
            <div>
                {images.map(image => {
                    return(
                        <div>
                            <div>
                                <img src={image.urls.regular} style={style} />  
                            </div>
                        </div>
                    ) 
                })}
            </div>
        )
    }
}

export default ImageRender