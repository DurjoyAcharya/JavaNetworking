package com.solid.LSP;

public class Whatsapp extends SocialMedia{
    @Override
    public void chatWithFriend() {

    }

    @Override
    public void postStatus(Object post) {
        //Not supported by whatsapp
        //that means is avoid Liskov substitution principle
    }

    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void groupCallWithFriends(String... users) {

    }
}
