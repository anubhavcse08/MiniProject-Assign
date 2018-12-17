import React, { Component } from 'react';
import './App.css';
import Search from './component/search/search';
import axios from  'axios';
import ImageRender from './component/imageRender';
import youtube from './component/apis/youtube';
// import YoutubeVideos from './component/presentation/youtubeVideos';
// import VideoList from './component/presentation/videoList';
// import 'semantic-ui/dist/semantic.min.css'

class App extends Component {

  constructor() {
    super()
    this.state = {
        images:[],
        videos:[],
        videoSelect: null
    }
    this.searchedImage = this.searchedImage.bind(this)
  }

  async searchedImage(data)  {
    // https://unsplash.com/oauth/applications/46422
    const response = await axios.get('https://api.unsplash.com/search/photos', { 
       params : {query : data},
       headers :{
        Authorization: 'Client-ID 67a08a4ac624ae307bc6b58dc2c177d3b920ca420f9211ad61f8f9f8dcd1f5ec'
       }
    })
    this.setState({
      images: response.data.results
    })
  }

  searchedVideo = async(item) => {
    const resYoutube = await youtube.get('/search', {
      params: {
        q:item
      }
    });
    this.setState({
      videos: resYoutube.data.items
    })
  }

  onVideoSelect = (video) => {
    console.log("Onvideo selectcted", video)
  }
  // AIzaSyA5X-tVhNMtVbsoiZIdqKYJMIdmUHw72X0        youtube data Api
  render() {
    return (
      <div className="App">
        <Search searchImageMethod={this.searchedImage}  searchVideoMethod={this.searchedVideo}/>
        <ImageRender images = {this.state.images} />
        {/* <YoutubeVideos videos = {this.state.videos} /> */}
        {/* <VideoList onVideoSelect = {this.onVideoSelect} videos = {this.state.videos}/> */}
      </div>
    );
  }
}

export default App;
