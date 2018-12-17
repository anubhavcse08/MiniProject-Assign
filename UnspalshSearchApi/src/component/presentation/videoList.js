import React from 'react'
import VideoItem from './videoItem';

class VideoList extends React.Component {
    
    render() {
        const videos = this.props.videos;
        const onVideoSelect = this.props.onVideoSelect
        const renderVideo = videos.map((video) => {
            return <VideoItem video={video} onVideoSelect={onVideoSelect}/>
        })
        return(
            <div className="ui relaxed divided list">
                {renderVideo}
            </div>
        )
    }
}

export default VideoList