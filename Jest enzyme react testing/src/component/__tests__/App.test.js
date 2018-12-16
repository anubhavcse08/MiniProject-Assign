import React from 'react';
import {shallow } from 'enzyme';
import CommentBox from 'component/CommentBox';
import CommentList from 'component/CommentList';
import App from 'component/App';

let wrapper;
beforeEach(() => {
    wrapper = shallow(<App />)
})

it('Shows a Comment Box', () => {
    // const div = document.createElement('div')
    // ReactDOM.render(<App />, div);
    // expect(div.innerHTML).toContain('CommentBox');
    // expect(div.innerHTML).toContain('CommentList');
    // ReactDOM.unmountComponentAtNode(div)
    expect(wrapper.find(CommentBox).length).toEqual(1);
});

it('Shows a Comment List', () => {
    expect(wrapper.find(CommentList).length).toEqual(1);
});