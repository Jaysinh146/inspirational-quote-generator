package com.yourname.quote.service;

import com.yourname.quote.model.Quote;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class QuoteService {
    private final List<Quote> quotes;
    private final Random random;

    public QuoteService() {
        quotes = new ArrayList<>();
        random = new Random();
        
        // Extended list of inspirational quotes
        quotes.add(new Quote("Be the change you wish to see in the world.", "Mahatma Gandhi"));
        quotes.add(new Quote("The only way to do great work is to love what you do.", "Steve Jobs"));
        quotes.add(new Quote("In the middle of difficulty lies opportunity.", "Albert Einstein"));
        quotes.add(new Quote("Success is not final, failure is not fatal: it is the courage to continue that counts.", "Winston Churchill"));
        quotes.add(new Quote("The future belongs to those who believe in the beauty of their dreams.", "Eleanor Roosevelt"));
        quotes.add(new Quote("Everything you've ever wanted is on the other side of fear.", "George Addair"));
        quotes.add(new Quote("The only limit to our realization of tomorrow will be our doubts of today.", "Franklin D. Roosevelt"));
        quotes.add(new Quote("What you get by achieving your goals is not as important as what you become by achieving your goals.", "Zig Ziglar"));
        quotes.add(new Quote("The mind is everything. What you think you become.", "Buddha"));
        quotes.add(new Quote("The best time to plant a tree was 20 years ago. The second best time is now.", "Chinese Proverb"));
        quotes.add(new Quote("Your time is limited, don't waste it living someone else's life.", "Steve Jobs"));
        quotes.add(new Quote("Life is 10% what happens to you and 90% how you react to it.", "Charles R. Swindoll"));
        quotes.add(new Quote("The only person you are destined to become is the person you decide to be.", "Ralph Waldo Emerson"));
        quotes.add(new Quote("The journey of a thousand miles begins with one step.", "Lao Tzu"));
        quotes.add(new Quote("What lies behind us and what lies before us are tiny matters compared to what lies within us.", "Ralph Waldo Emerson"));
    }

    public Quote getRandomQuote() {
        return quotes.get(random.nextInt(quotes.size()));
    }
} 