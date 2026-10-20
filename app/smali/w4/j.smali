.class public final Lw4/j;
.super Ljava/lang/Object;


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z

.field public final d:I

.field public final e:Lk4/k;


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, Lk4/k;->a:Lk4/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lw4/j;->a:Z

    iput-boolean v1, p0, Lw4/j;->b:Z

    iput-boolean v1, p0, Lw4/j;->c:Z

    const/4 v1, 0x4

    iput v1, p0, Lw4/j;->d:I

    iput-object v0, p0, Lw4/j;->e:Lk4/k;

    return-void
.end method
