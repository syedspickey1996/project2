package com.niit.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table
@SequenceGenerator(name="forumcommentidseq", sequenceName="forumcommentidseq")
public class ForumComment
{
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="forumcommentidseq")
int commentId;
int forumId;
String discussionText;
String loginname;
@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="dd-MM-yyyy")
Date discussionDate;
public int getCommentId() {
	return commentId;
}
public void setCommentId(int commentId) {
	this.commentId = commentId;
}
public int getForumId() {
	return forumId;
}
public void setForumId(int forumId) {
	this.forumId = forumId;
}
public String getDiscussionText() {
	return discussionText;
}
public void setDiscussionText(String discussionText) {
	this.discussionText = discussionText;
}
public String getLoginname() {
	return loginname;
}
public void setLoginname(String loginname) {
	this.loginname = loginname;
}
public Date getDiscussionDate() {
	return discussionDate;
}
public void setDiscussionDate(Date discussionDate) {
	this.discussionDate = discussionDate;
}

}
