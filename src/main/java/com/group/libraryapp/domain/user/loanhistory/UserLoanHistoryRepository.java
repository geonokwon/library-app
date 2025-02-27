package com.group.libraryapp.domain.user.loanhistory;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoanHistoryRepository extends JpaRepository<UserLoanHistory, Long> {
    boolean existsByBookNameAndIsReturn(String bookName, boolean isReturn);
//    Optional<UserLoanHistory> findByUserIdAndBookName(long userId, String bookName);

}
