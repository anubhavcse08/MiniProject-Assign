import React from 'react'
import youtube from '../apis/youtube';


class YoutubeVideos extends React.Component {
    render() {
        const videos = this.props.videos

        let style ={
            width:'300px',
            height:'300px',
            float:'left',
            padding: '10px',
            border: '2px solid #d3d3d3',
            marginLeft: '10px',
            marginButtom: '30px'
        }
        console.log(videos)
        return(
            <div>
                {videos.map(video => {
                    return(
                        <div>
                            <div>
                                <img src={video.snippet.thumbnails.medium.url} style={style} />  
                            </div>
                        </div>
                    ) 
                })}
            </div>
        )
    }
}

export default YoutubeVideos