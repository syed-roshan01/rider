.class public abstract Lcom/google/gson/internal/sql/e;
.super Ljava/lang/Object;


# static fields
.field public static final a:Z

.field public static final b:Lp7/b0;

.field public static final c:Lp7/b0;

.field public static final d:Lp7/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    :try_start_0
    const-string v0, "java.sql.Date"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lcom/google/gson/internal/sql/e;->a:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/gson/internal/sql/a;->b:Lp7/b0;

    sput-object v0, Lcom/google/gson/internal/sql/e;->b:Lp7/b0;

    sget-object v0, Lcom/google/gson/internal/sql/b;->b:Lp7/b0;

    sput-object v0, Lcom/google/gson/internal/sql/e;->c:Lp7/b0;

    sget-object v0, Lcom/google/gson/internal/sql/c;->b:Lp7/b0;

    sput-object v0, Lcom/google/gson/internal/sql/e;->d:Lp7/b0;

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    sput-object v0, Lcom/google/gson/internal/sql/e;->b:Lp7/b0;

    sput-object v0, Lcom/google/gson/internal/sql/e;->c:Lp7/b0;

    sput-object v0, Lcom/google/gson/internal/sql/e;->d:Lp7/b0;

    :goto_1
    return-void
.end method
