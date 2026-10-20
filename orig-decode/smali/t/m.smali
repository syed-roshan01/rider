.class public final Lt/m;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lt/x1;

.field public final b:Ljava/lang/Object;

.field public final c:J

.field public final d:Lc9/a;

.field public final e:Lm0/n1;

.field public f:Lt/t;

.field public g:J

.field public h:J

.field public final i:Lm0/n1;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lt/x1;Lt/t;JLjava/lang/Object;JLt/h1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lt/m;->a:Lt/x1;

    iput-object p6, p0, Lt/m;->b:Ljava/lang/Object;

    iput-wide p7, p0, Lt/m;->c:J

    iput-object p9, p0, Lt/m;->d:Lc9/a;

    sget-object p2, Lm0/o3;->a:Lm0/o3;

    invoke-static {p1, p2}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Lt/m;->e:Lm0/n1;

    invoke-static {p3}, Lt/e;->j(Lt/t;)Lt/t;

    move-result-object p1

    iput-object p1, p0, Lt/m;->f:Lt/t;

    iput-wide p4, p0, Lt/m;->g:J

    const-wide/high16 p3, -0x8000000000000000L

    iput-wide p3, p0, Lt/m;->h:J

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, p2}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Lt/m;->i:Lm0/n1;

    return-void
.end method
