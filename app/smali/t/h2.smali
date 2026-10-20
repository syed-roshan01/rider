.class public final Lt/h2;
.super Ljava/lang/Object;

# interfaces
.implements Lt/a2;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Lt/c2;


# direct methods
.method public constructor <init>(IILt/a0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lt/h2;->a:I

    iput p2, p0, Lt/h2;->b:I

    new-instance v0, Lt/c2;

    new-instance v1, Lt/i0;

    invoke-direct {v1, p1, p2, p3}, Lt/i0;-><init>(IILt/a0;)V

    invoke-direct {v0, v1}, Lt/c2;-><init>(Lt/f0;)V

    iput-object v0, p0, Lt/h2;->c:Lt/c2;

    return-void
.end method


# virtual methods
.method public final c(JLt/t;Lt/t;Lt/t;)Lt/t;
    .locals 6

    iget-object v0, p0, Lt/h2;->c:Lt/c2;

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lt/c2;->c(JLt/t;Lt/t;Lt/t;)Lt/t;

    move-result-object p1

    return-object p1
.end method

.method public final d(JLt/t;Lt/t;Lt/t;)Lt/t;
    .locals 6

    iget-object v0, p0, Lt/h2;->c:Lt/c2;

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lt/c2;->d(JLt/t;Lt/t;Lt/t;)Lt/t;

    move-result-object p1

    return-object p1
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lt/h2;->b:I

    return v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Lt/h2;->a:I

    return v0
.end method
