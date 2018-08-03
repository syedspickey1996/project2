package com.niit.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.niit.dao.ForumCommentDAO;
import com.niit.dao.ForumDAO;
import com.niit.model.Blog;
import com.niit.model.BlogComment;
import com.niit.model.Forum;
import com.niit.model.ForumComment;

@RestController
public class ForumRestController
{
	@Autowired
	ForumDAO forumDAO;
	
	@Autowired
	ForumCommentDAO forumCommentDAO;
	
	@GetMapping("/listForums")
	public ResponseEntity<List<Forum>> listForums()
	{
		List<Forum> listForums=forumDAO.listForums();
		
		if(listForums.size()>0)
		{
			return new ResponseEntity<List<Forum>>(listForums,HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<List<Forum>>(listForums,HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping(value="/addForum")
	public ResponseEntity<String> insertForum(@RequestBody Forum forum)
	{	
		forum.setCreateDate(new java.util.Date());
		forum.setStatus("NA");
		if(forumDAO.addForum(forum))
		{
			return new ResponseEntity<String>("Success",HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("Failure",HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/getForum/{forumid}")
	public ResponseEntity<Forum> getForum(@PathVariable("forumid")int forumid)
	{
		Forum forum=forumDAO.getForum(forumid);
		if(forum!=null)
		{
			return new ResponseEntity<Forum>(forum,HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<Forum>(forum,HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/approveForum/{forumid}")
	public ResponseEntity<Forum> approveForum(@PathVariable("forumid")int forumid)
	{
		if(forumDAO.approveForum(forumid))
		{
			return new ResponseEntity("Success",HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity("Failure",HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/rejectForum/{forumid}")
	public ResponseEntity<Forum> rejectForum(@PathVariable("forumid")int forumid)
	{
		if(forumDAO.rejectForum(forumid))
		{
			return new ResponseEntity("Success",HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity("Failure",HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/deleteForum/{forumid}")
	public ResponseEntity<String> deleteForum(@PathVariable("forumid")int forumid)
	{
		Forum forum=forumDAO.getForum(forumid);
		
		if(forumDAO.deleteForum(forum))
		{
			return new ResponseEntity("Success",HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity("Failure",HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/updateForum")
	public ResponseEntity<String> updateForum(@RequestBody Forum forum)
	{
		if(forumDAO.updateForum(forum))
		{
			return new ResponseEntity("Success",HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity("Failure",HttpStatus.NOT_FOUND);	
		}
	}
	
	@GetMapping("/getAllForumComment/{forumid}")
	public ResponseEntity<List<ForumComment>> getAllComments(@PathVariable("forumid")int forumid)
	{
		List<ForumComment> listForumComments=forumCommentDAO.getAllComments(forumid);
		
		if(listForumComments.size()>0)
		{
			return new ResponseEntity<List<ForumComment>>(listForumComments,HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<List<ForumComment>>(listForumComments,HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/insertForumComment")
	public ResponseEntity<String> insertForumComment(@RequestBody ForumComment comment)
	{
		comment.setDiscussionDate(new java.util.Date());
		if(forumCommentDAO.addComment(comment))
		{
			return new ResponseEntity("Success",HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity("Failure",HttpStatus.NOT_FOUND);	
		}
	}
}
