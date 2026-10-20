package com.google.firebase.firestore.model.mutation;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import o7.g2;
import o7.i2;

/* JADX INFO: loaded from: classes.dex */
public class NumericIncrementTransformOperation implements TransformOperation {
    private i2 operand;

    public NumericIncrementTransformOperation(i2 i2Var) {
        Assert.hardAssert(Values.isNumber(i2Var), "NumericIncrementTransformOperation expects a NumberValue operand", new Object[0]);
        this.operand = i2Var;
    }

    private double operandAsDouble() {
        if (Values.isDouble(this.operand)) {
            return this.operand.u();
        }
        if (Values.isInteger(this.operand)) {
            return this.operand.w();
        }
        throw Assert.fail("Expected 'operand' to be of Number type, but was " + this.operand.getClass().getCanonicalName(), new Object[0]);
    }

    private long operandAsLong() {
        if (Values.isDouble(this.operand)) {
            return (long) this.operand.u();
        }
        if (Values.isInteger(this.operand)) {
            return this.operand.w();
        }
        throw Assert.fail("Expected 'operand' to be of Number type, but was " + this.operand.getClass().getCanonicalName(), new Object[0]);
    }

    private long safeIncrement(long j10, long j11) {
        long j12 = j10 + j11;
        if (((j10 ^ j12) & (j11 ^ j12)) >= 0) {
            return j12;
        }
        return j12 >= 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
    }

    @Override // com.google.firebase.firestore.model.mutation.TransformOperation
    public i2 applyToLocalView(i2 i2Var, Timestamp timestamp) {
        i2 i2VarComputeBaseValue = computeBaseValue(i2Var);
        if (Values.isInteger(i2VarComputeBaseValue) && Values.isInteger(this.operand)) {
            long jSafeIncrement = safeIncrement(i2VarComputeBaseValue.w(), operandAsLong());
            g2 g2VarC = i2.C();
            g2VarC.j(jSafeIncrement);
            return (i2) g2VarC.m3997build();
        }
        if (Values.isInteger(i2VarComputeBaseValue)) {
            double dW = i2VarComputeBaseValue.w() + operandAsDouble();
            g2 g2VarC2 = i2.C();
            g2VarC2.h(dW);
            return (i2) g2VarC2.m3997build();
        }
        Assert.hardAssert(Values.isDouble(i2VarComputeBaseValue), "Expected NumberValue to be of type DoubleValue, but was ", i2Var.getClass().getCanonicalName());
        double dU = i2VarComputeBaseValue.u() + operandAsDouble();
        g2 g2VarC3 = i2.C();
        g2VarC3.h(dU);
        return (i2) g2VarC3.m3997build();
    }

    @Override // com.google.firebase.firestore.model.mutation.TransformOperation
    public i2 applyToRemoteDocument(i2 i2Var, i2 i2Var2) {
        return i2Var2;
    }

    @Override // com.google.firebase.firestore.model.mutation.TransformOperation
    public i2 computeBaseValue(i2 i2Var) {
        if (Values.isNumber(i2Var)) {
            return i2Var;
        }
        g2 g2VarC = i2.C();
        g2VarC.j(0L);
        return (i2) g2VarC.m3997build();
    }

    public i2 getOperand() {
        return this.operand;
    }
}
