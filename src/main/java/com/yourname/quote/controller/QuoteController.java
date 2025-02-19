package com.yourname.quote.controller;

import com.yourname.quote.model.Quote;
import com.yourname.quote.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuoteController {

    private final QuoteService quoteService;

    @Autowired
    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("quote", quoteService.getRandomQuote());
        return "index";
    }

    @GetMapping("/api/quote")
    @ResponseBody
    public Quote getRandomQuote() {
        return quoteService.getRandomQuote();
    }
} 