package com.sonal.tracker.coronavirustracker.controllers;

import com.sonal.tracker.coronavirustracker.models.LocationStats;
import com.sonal.tracker.coronavirustracker.srevices.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/")
    public String home(Model model){
        List<LocationStats> allStats=coronaVirusDataService.getAllStats();
        int totalCases=allStats.stream().mapToInt(stat -> Integer.parseInt(stat.getLatestTotalCases())).sum();
        int diffFromPreviousDay=allStats.stream().mapToInt(stat -> Integer.parseInt(stat.getDiffFromPreviousDay())).sum();
        model.addAttribute("locationStats",allStats);
        model.addAttribute("totalReportedCases",totalCases);
        model.addAttribute("totalNewCases",diffFromPreviousDay);
        return "home";
    }
}
