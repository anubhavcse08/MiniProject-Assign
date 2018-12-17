import React from 'react'
import pic from '../../image/bg.png'
import './videoItem.css'

class VideoItem extends React.Component {
    render() {
        const video = this.props.video
        const onVideoSelect = this.props.onVideoSelect

        // console.log(video.snippet.thumbnails.medium.url)
        return(
            <div onClick={() => onVideoSelect(video)} className="item video-item">
            {/* {video.snippet.thumbnails.medium.url} */}
                <img className="ui avtar image" src={video.snippet.thumbnails.medium.url} />
                <div class="content">
                    <a class="header">{video.snippet.title}</a>
                    {/* <div class="description">Last seen watching <a><b>Arrested Development</b></a> just now.</div> */}
                </div>
                
            </div>
        )
    }
}

export default VideoItem