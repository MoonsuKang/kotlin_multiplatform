//
//  UserObservable.swift
//  iosApp
//
//  Created by 강문수 on 4/5/25.
//  Copyright © 2025 orgName. All rights reserved.
//

import Foundation
import shared
import Combine

@MainActor
class UserObservable: ObservableObject {
    private let getUsersUseCase = SharedUseCaseProvider().provideGetUsersUseCase()

    @Published var users: [User] = []

    func loadUsers() {
        Task {
            do {
                let result = try await getUsersUseCase.invoke()
                self.users = result
            } catch {
                print("failed to load users: \(error)")
            }
        }
    }
}

