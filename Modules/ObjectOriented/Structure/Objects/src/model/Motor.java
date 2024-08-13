package model;

import model.type.MotorType;

/**
 * Represents the motor of a car with displacement and type.
 */
public record Motor(double displacement, MotorType type) {
}
