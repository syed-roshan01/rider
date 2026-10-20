.class public final Lz/c0;
.super Lw8/c;


# instance fields
.field public a:Lz/g0;

.field public b:Lu/s1;

.field public c:Lc9/e;

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lz/g0;

.field public f:I


# direct methods
.method public constructor <init>(Lz/g0;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lz/c0;->e:Lz/g0;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lz/c0;->d:Ljava/lang/Object;

    iget p1, p0, Lz/c0;->f:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lz/c0;->f:I

    iget-object p1, p0, Lz/c0;->e:Lz/g0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lz/g0;->c(Lu/s1;Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
