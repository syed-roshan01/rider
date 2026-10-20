.class public final Lk4/d;
.super Lw8/c;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Lu9/f;

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lk4/e;

.field public e:I


# direct methods
.method public constructor <init>(Lk4/e;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lk4/d;->d:Lk4/e;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lk4/d;->c:Ljava/lang/Object;

    iget p1, p0, Lk4/d;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lk4/d;->e:I

    iget-object p1, p0, Lk4/d;->d:Lk4/e;

    invoke-virtual {p1, p0}, Lk4/e;->a(Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
