.class public final Lv/a2;
.super Lw8/c;


# instance fields
.field public a:Lv/b2;

.field public b:J

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lv/b2;

.field public e:I


# direct methods
.method public constructor <init>(Lv/b2;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lv/a2;->d:Lv/b2;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lv/a2;->c:Ljava/lang/Object;

    iget p1, p0, Lv/a2;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lv/a2;->e:I

    iget-object v0, p0, Lv/a2;->d:Lv/b2;

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Lv/b2;->L(JJLu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
