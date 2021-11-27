package ru.netology.domain;

public class VKWallPost {
    private String postId;
    private String wallOwnerId;
    private String creator;
    private String creatorId;
    private String postType;
    private String replyPostId;
    private String replyOwnerId;
    private boolean friendsOnly;
    private String postDate;
    private String postText;
    private String imageUrl;
    private String signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean containAdd;
    private boolean addedToBookmarks;
    private int postponedId;

    private AddToBookmarks addToBookmarks;
    private ReadButton readButton;
    private Likes likes;
    private CommentsInfo commentsInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private PostSource postSource;
    private Geo geo;
    private Donut donut;


    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getWallOwnerId() {
        return wallOwnerId;
    }

    public void setWallOwnerId(String wallOwnerId) {
        this.wallOwnerId = wallOwnerId;
    }

    public String getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(String replyPostId) {
        this.replyPostId = replyPostId;
    }

    public String getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(String replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public boolean isFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(boolean friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }


    public String getSignerId() {
        return signerId;
    }

    public void setSignerId(String signerId) {
        this.signerId = signerId;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }


    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }


    public boolean isPinned() {
        return isPinned;
    }

    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }

    public boolean isContainAdd() {
        return containAdd;
    }

    public void setContainAdd(boolean containAdd) {
        this.containAdd = containAdd;
    }

    public boolean isAddedToBookmarks() {
        return addedToBookmarks;
    }

    public void setAddedToBookmarks(boolean addedToBookmarks) {
        this.addedToBookmarks = addedToBookmarks;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }
}
