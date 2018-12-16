import React from 'react';
import { mount } from 'enzyme';
import CommentBox from 'component/CommentBox';

let wrapper;
beforeEach(() => {
    wrapper = mount(<CommentBox />)
})
afterEach(() => {
    wrapper.unmount();
})
it('Shows inside Comment Box', () => {
    expect(wrapper.find('textarea').length).toEqual(1);
    expect(wrapper.find('button').length).toEqual(1);
});
it('has a text area and a button', () => {
    wrapper.find('textarea').simulate('change', {
        target:{value : 'new comment'}
    })
})