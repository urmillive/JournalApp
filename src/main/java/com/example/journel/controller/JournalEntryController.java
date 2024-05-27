package com.example.journel.controller;

import com.example.journel.entity.JournelEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    private Map<Long,JournelEntry> journalEntries = new HashMap<>();

    @GetMapping
    public List<JournelEntry> getAll(){
        return new ArrayList<>(journalEntries.values());
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournelEntry entry){
        journalEntries.put(entry.getJournelId(),entry);
        return true;
    }

    @GetMapping("/id/{id}")
    public JournelEntry getJournalById(@PathVariable Long id){
        return journalEntries.get(id);
    }

    @DeleteMapping("/id/{id}")
    public JournelEntry deleteJournalById(@PathVariable Long id){
        return journalEntries.remove(id);
    }

    @PutMapping("/id/{id}")
    public JournelEntry updateJournalById(@PathVariable Long id,@RequestBody JournelEntry entry){
        return journalEntries.put(id,entry);
    }

}
