.class public final Lm0/t1;
.super Ljava/lang/Object;

# interfaces
.implements Lm0/g1;
.implements Lm9/d0;


# instance fields
.field public final a:Lu8/j;

.field public final synthetic b:Lm0/g1;


# direct methods
.method public constructor <init>(Lm0/g1;Lu8/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lm0/t1;->a:Lu8/j;

    iput-object p1, p0, Lm0/t1;->b:Lm0/g1;

    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lm0/t1;->b:Lm0/g1;

    invoke-interface {v0}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final q()Lu8/j;
    .locals 1

    iget-object v0, p0, Lm0/t1;->a:Lu8/j;

    return-object v0
.end method

.method public final setValue(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lm0/t1;->b:Lm0/g1;

    invoke-interface {v0, p1}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    return-void
.end method
