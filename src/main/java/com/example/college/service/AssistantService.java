package com.example.college.service;

import com.example.college.entity.AssistantEntity;
import com.example.college.repository.AssistantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AssistantService {
    private final AssistantRepository AssistantRepository;

    public List<AssistantEntity> findAllAssistants() {
        return AssistantRepository.findAll();
    }

    public AssistantEntity findAssistantById(Integer id) {
        return AssistantRepository.findById(id).orElseThrow();
    }

    public void saveAssistant(AssistantEntity Assistant) {
        AssistantRepository.save(Assistant);
    }

    public void updateAssistant(AssistantEntity Assistant) {
        AssistantRepository.save(Assistant);
    }

    public void deleteAssistant(Integer id) {
        AssistantRepository.deleteById(id);
    }
}