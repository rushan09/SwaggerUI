package com.swagger.sample.api;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.swagger.sample.util.Book;


/**
 * @author Rushan
 *
 */
@Controller
@RequestMapping(value = "/bookdetails")
public class BookDetails {

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Book createUser(@RequestBody Book book) {
		return book;
	}

}
