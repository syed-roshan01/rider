.class public interface abstract Lm0/d1;
.super Ljava/lang/Object;

# interfaces
.implements Lm0/g1;
.implements Lm0/l3;


# virtual methods
.method public getValue()Ljava/lang/Object;
    .locals 1

    move-object v0, p0

    check-cast v0, Lm0/s2;

    invoke-virtual {v0}, Lm0/s2;->d()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public setValue(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    move-object v0, p0

    check-cast v0, Lm0/s2;

    invoke-virtual {v0, p1}, Lm0/s2;->f(F)V

    return-void
.end method
