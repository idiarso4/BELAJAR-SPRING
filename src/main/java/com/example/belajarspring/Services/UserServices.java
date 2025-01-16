import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.belajarspring.DTO.TaskDTO;
import com.example.belajarspring.DTO.UserDTO;
import com.example.belajarspring.model.User;
import com.example.belajarspring.repository.UserRepository;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDTO convertToDTO(User user) {
        List<TaskDTO> taskDTOs = user.getTasks().stream()
                .map(TaskDTO::new)
                .collect(Collectors.toList());
        return UserDTO.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .password(user.getPassword())
                .roles(user.getRoles())
                .task(taskDTOs)
                .build();
    }

    public List<UserDTO> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public UserDTO getUserById(long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User dengan id = " + id + " tidak ditemukan"));
        return this.convertToDTO(user);
    }
}
