package com.monTest1.ex.repository;

import com.monTest1.ex.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
