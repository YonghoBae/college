package com.example.college.controller;

import com.example.college.entity.ClubEntity;
import com.example.college.entity.ActivityEntity;
import com.example.college.entity.ActivityParticipationEntity;
import com.example.college.entity.BudgetEntity;
import com.example.college.service.ClubService;
import com.example.college.service.ActivityService;
import com.example.college.service.ActivityParticipationService;
import com.example.college.service.BudgetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/club")
@RequiredArgsConstructor
public class ClubController {

    private final ClubService clubService;
    private final ActivityService activityService;
    private final ActivityParticipationService activityParticipationService;
    private final BudgetService budgetService;

    // 모든 클럽 조회
    @GetMapping
    public List<ClubEntity> getAllClubs() {
        return clubService.findAllClubs();
    }

    // 특정 클럽에 대한 상세 정보 조회 (활동, 예산, 교수, 참여자 포함)
    @GetMapping("/{clubName}")
    public ClubWithDetailsResponse getClubDetails(@PathVariable String clubName) {
        // 클럽 정보 조회
        ClubEntity club = clubService.findClubById(clubName);

        // 해당 클럽의 활동 조회
        List<ActivityEntity> activities = activityService.findAllActivities().stream()
                .filter(activity -> activity.getClub().getClubName().equals(clubName))
                .collect(Collectors.toList());

        // 해당 클럽의 참여자 조회
        List<ActivityParticipationEntity> participants = activities.stream()
                .flatMap(activity -> activityParticipationService.findByActivityName(activity.getActivityName()).stream())
                .collect(Collectors.toList());

        // 해당 클럽의 예산 조회
        List<BudgetEntity> budgets = budgetService.findBudgetsByClub(clubName);

        return new ClubWithDetailsResponse(club, activities, participants, budgets);
    }

    // 새로운 클럽 생성
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClubEntity createClub(@RequestBody ClubEntity club) {
        clubService.saveClub(club);
        return club;
    }

    // 클럽 정보 수정
    @PutMapping("/{clubName}")
    public ClubEntity updateClub(@PathVariable String clubName, @RequestBody ClubEntity club) {
        club.setClubName(clubName);
        clubService.saveClub(club);
        return club;
    }

    // 클럽 삭제
    @DeleteMapping("/{clubName}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteClub(@PathVariable String clubName) {
        clubService.deleteClub(clubName);
    }

    // 클럽에 포함된 활동, 참여자, 예산 정보 등을 묶어서 보여주는 리스폰스 DTO
    public static class ClubWithDetailsResponse {
        private ClubEntity club;
        private List<ActivityEntity> activities;
        private List<ActivityParticipationEntity> participants;
        private List<BudgetEntity> budgets;

        public ClubWithDetailsResponse(ClubEntity club, List<ActivityEntity> activities, List<ActivityParticipationEntity> participants, List<BudgetEntity> budgets) {
            this.club = club;
            this.activities = activities;
            this.participants = participants;
            this.budgets = budgets;
        }

        public ClubEntity getClub() {
            return club;
        }

        public List<ActivityEntity> getActivities() {
            return activities;
        }

        public List<ActivityParticipationEntity> getParticipants() {
            return participants;
        }

        public List<BudgetEntity> getBudgets() {
            return budgets;
        }
    }

    // 특정 클럽의 예산 조회
    @GetMapping("/{clubName}/budgets")
    public List<BudgetEntity> getBudgetsByClub(@PathVariable String clubName) {
        return budgetService.findBudgetsByClub(clubName);
    }

    // 예산 추가
    @PostMapping("/{clubName}/budgets")
    @ResponseStatus(HttpStatus.CREATED)
    public BudgetEntity addBudgetToClub(@PathVariable String clubName, @RequestBody BudgetEntity budget) {
        budget.setClub(clubService.findClubById(clubName));  // 클럽과 예산 연결
        return budgetService.saveBudget(budget);
    }

    // 예산 수정
    @PutMapping("/budgets/{budgetId}")
    public BudgetEntity updateBudget(@PathVariable Integer budgetId, @RequestBody BudgetEntity budget) {
        budget.setBudgetId(budgetId);
        return budgetService.updateBudget(budget);
    }

    // 예산 삭제
    @DeleteMapping("/budgets/{budgetId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBudget(@PathVariable Integer budgetId) {
        budgetService.deleteBudget(budgetId);
    }
}
